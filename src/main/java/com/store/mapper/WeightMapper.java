package com.store.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.*;
import javax.validation.Valid;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.lucene.search.Weight;

import com.store.entity.WeightLog;

@Mapper
public interface WeightMapper {
	 @Insert("INSERT INTO weights (user_id, weight, recorded_at) VALUES (#{userId}, #{weight}, NOW())")
	    @Options(useGeneratedKeys = true, keyProperty = "id")
	    void insertWeight(WeightLog weight);

	    @Select("SELECT * FROM weights WHERE user_id = #{userId} ORDER BY recorded_at DESC")
	    @Results({
	        @Result(property = "id", column = "id"),
	        @Result(property = "user.id", column = "user_id"),
	        @Result(property = "weight", column = "weight"),
	        @Result(property = "recordedAt", column = "recorded_at")
	    })
	    List<WeightLog> findWeightsByUserId(Long userId);
	}


