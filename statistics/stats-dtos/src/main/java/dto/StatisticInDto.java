package dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatisticInDto {

    @NotEmpty(message = "Название приложения не может быть пустым")
     String app;
    @NotEmpty(message = "URI не может быть путсым")
     String uri;
    @NotEmpty(message = "Необходимо указать IP пользователя")
     String ip;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "Необходимо указать время отправления запроса")
     LocalDateTime timestamp;
}