package com.fmall.mapper;

import com.fmall.pojo.TbOrder;
import com.fmall.pojo.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    long countByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int deleteByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int insert(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int insertSelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    TbOrder selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Fri Apr 28 17:20:11 CST 2017
     */
    int updateByPrimaryKey(TbOrder record);
}