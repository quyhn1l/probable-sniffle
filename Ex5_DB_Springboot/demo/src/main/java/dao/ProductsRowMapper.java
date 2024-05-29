package dao;

import model.Products;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsRowMapper implements RowMapper<Products> {
    @Override
    public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
        Products product = new Products();
        product.setProductId(rs.getInt("product_id"));
        product.setProductCode(rs.getString("product_code"));
        product.setProductName(rs.getString("product_name"));
        product.setProductPrice(rs.getInt("product_price"));
        product.setProductDescribe(rs.getString("product_describe"));
        product.setProductImagePath(rs.getString("product_image_path"));
        product.setProductInStorage(rs.getInt("product_in_storage"));
        product.setBoughtProductNumber(rs.getInt("bought_product_number"));
        product.setCategoryId(rs.getInt("category_id"));
        product.setStorageId(rs.getInt("storage_id"));
        return product;
    }
}
