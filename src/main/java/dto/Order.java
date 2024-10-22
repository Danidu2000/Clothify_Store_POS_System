package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Order {
    private String order_id;
    private String user_id;
    private String payment_type;
    private LocalDate order_date;
    private Double total_cost;
}
