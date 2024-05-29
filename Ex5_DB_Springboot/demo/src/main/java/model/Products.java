package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products {
    private int productId;
    private String productName;
    private String productCode;
    private int productPrice;
    private String productDescribe;
    private String productImagePath;
    private int productInStorage;
    private int boughtProductNumber;
    private int categoryId;
    private int storageId;


}
