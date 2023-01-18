package deepanshi.bookmyshow.DTO;

import lombok.Data;

@Data
public class UserRequestDto {
    // only that parameters that we require by user
    private String name;
    private String mobile;


}
