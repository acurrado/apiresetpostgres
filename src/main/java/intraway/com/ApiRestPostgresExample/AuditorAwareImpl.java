package intraway.com.ApiRestPostgresExample;

import com.sun.istack.NotNull;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @NotNull
    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.of("admin");
    }
}
