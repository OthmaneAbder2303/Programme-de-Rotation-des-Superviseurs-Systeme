package ma.ensa.programmederotationdessuperviseurssysteme.models;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Incident {

    private String reference;
    private Date time;
    private String status;

}
