package model;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Categories {
    private int categoryId;
    private String categoryCode;
    private String categoryName;
    private String categoryDescribe;
    private Date categoryCreatedDate;
    private Date categoryModifyDate;
}
