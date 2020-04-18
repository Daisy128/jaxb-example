package LittlePrince;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Rating {

    @XmlAttribute
    private int stars;
    @XmlValue
    private double marks;
    @XmlAttribute
    private int googleReads;

}
