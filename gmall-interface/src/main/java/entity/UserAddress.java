package entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    private String  userAddress;
    private String  userId;
    //收货人
    private String  consignee;
    private String  phoneNum;
    private String  isDefault;
}
