package intraway.com.ApiRestPostgresExample.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserRequest {

    @NotBlank(message = "Please provide a firstname")
    private String firstName;

    @NotBlank(message = "Please provide a lastName")
    private String lastName;

    @Email(message = "Please provide a valid email address")
    private String email;

    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @NotBlank(message = "Please provide a valid phonenumber")
    private String phoneNumber;

    @NotNull(message = "IsActive must be provided (true or false)")
    private boolean isActive;
}
