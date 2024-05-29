package dao;

import model.Categories;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriesRowMapper  implements RowMapper <Categories> {

    @Override
    public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categories category = new Categories();
        category.setCategoryId(rs.getInt("category_id"));
        category.setCategoryCode(rs.getString("category_code"));
        category.setCategoryDescribe(rs.getString("category_describe"));
        category.setCategoryName(rs.getString("category_name"));
        category.setCategoryCreatedDate(rs.getDate("category_created_date"));
        category.setCategoryModifyDate(rs.getDate("category_modify_date"));
        return category;


    }
}
