package com.am.modules.order.dao;

import com.am.common.dao.MybatisDao;
import com.am.modules.goods.entity.Goods;
import com.am.modules.order.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@MybatisDao
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Delete({
        "delete from order",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Insert({
        "insert into order (ID, codeid, ",
        "time, name, count, ",
        "pay, machineID, ",
        "paykind, updatetime, ",
        "remarks, del)",
        "values (#{id,jdbcType=INTEGER}, #{codeid,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=TIMESTAMP}, #{name,jdbcType=VARCHAR}, #{count,jdbcType=INTEGER}, ",
        "#{pay,jdbcType=VARCHAR}, #{machineid,jdbcType=VARCHAR}, ",
        "#{paykind,jdbcType=INTEGER}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{remarks,jdbcType=VARCHAR}, #{del,jdbcType=INTEGER})"
    })
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, codeid, time, name, count, pay, machineID, paykind, updatetime, remarks, ",
        "del",
        "from order",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Update({
        "update order",
        "set codeid = #{codeid,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "name = #{name,jdbcType=VARCHAR},",
          "count = #{count,jdbcType=INTEGER},",
          "pay = #{pay,jdbcType=VARCHAR},",
          "machineID = #{machineid,jdbcType=VARCHAR},",
          "paykind = #{paykind,jdbcType=INTEGER},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "remarks = #{remarks,jdbcType=VARCHAR},",
          "del = #{del,jdbcType=INTEGER}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);

    List<Order> finAll();
    Order findByCodeID(String codeid);
    Order findByID(String id);
    int deleteByCodeID(String codeid);
}