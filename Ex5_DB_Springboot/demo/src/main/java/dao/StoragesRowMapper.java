package dao;

import model.Storages;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StoragesRowMapper implements RowMapper<Storages> {
    @Override
    public Storages mapRow(ResultSet rs, int rowNum) throws SQLException {
        Storages storage = new Storages();
        storage.setStorageId(rs.getInt("storage_id"));
        storage.setStorageCode(rs.getString("storage_code"));
        storage.setStorageName(rs.getString("storage_name"));
        storage.setStorageAddress(rs.getString("storage_address"));
        storage.setStorageDescribe(rs.getString("storage_describe"));
        storage.setStorageCreatedDate(rs.getDate("storage_created_date"));
        storage.setStorageModifyDate(rs.getDate("storage_modify_date"));
        return storage;
    }
}
