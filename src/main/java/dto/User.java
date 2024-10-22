package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private String user_id;
    private String user_name;
    private String name;
    private String email;
    private String password;
    private String role;
}
