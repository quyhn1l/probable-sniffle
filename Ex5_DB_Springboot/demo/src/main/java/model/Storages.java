package model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Storages {
    private  int storageId;
    private String storageName;
    private String storageCode;
    private String storageAddress;
    private String storageDescribe;
    private Date storageCreatedDate;
    private Date storageModifyDate;


}
