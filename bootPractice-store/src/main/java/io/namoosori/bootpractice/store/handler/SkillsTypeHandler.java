package io.namoosori.bootpractice.store.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import io.namoosori.bootpractice.entity.vo.Skill;
import io.namoosori.bootpractice.util.JsonUtil;

public class SkillsTypeHandler extends BaseTypeHandler<List<Skill>> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<Skill> skills, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JsonUtil.toJson(skills));
    }

    @Override
    public List<Skill> getNullableResult(ResultSet rs, String s) throws SQLException {
        String jsonString = rs.getString(s);
        return Optional.ofNullable(jsonString).map(json -> JsonUtil.fromJsonList(jsonString,Skill.class))
        .orElse(new ArrayList<>());
    }

    @Override
    public List<Skill> getNullableResult(ResultSet rs, int i) throws SQLException {
        String jsonString = rs.getString(i);
        return Optional.ofNullable(jsonString).map(json -> JsonUtil.fromJsonList(jsonString,Skill.class))
                .orElse(new ArrayList<>());
    }

    @Override
    public List<Skill> getNullableResult(CallableStatement cs, int i) throws SQLException {
        String jsonString = cs.getString(i);
        return Optional.ofNullable(jsonString).map(json -> JsonUtil.fromJsonList(jsonString,Skill.class))
                .orElse(new ArrayList<>());
    }
}

