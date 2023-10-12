packer {
  required_plugins {
    docker = {
      version = ">= 0.0.7"
      source  = "github.com/hashicorp/docker"
    }
  }
}

source "docker" "apirest" {
  commit = true
  image  = "openjdk:17-alpine"
  changes = [
    "CMD [\"/init.sh\"]"
  ]
}

build {
  sources = ["source.docker.apirest"]

  provisioner "file" {
    destination = "/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar"
    source      = "target/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar"
  }

  provisioner "file" {
      destination = "init.sh"
      source      = "init.sh"
    }

  post-processor "docker-tag" {
    repository = "apirestexample"
    tags       = ["latest"]
  }
}


