package com.LTNC.LTNC_Java.mapper;

import com.LTNC.LTNC_Java.model.CT_DonHang;
import com.LTNC.LTNC_Java.model.CT_DonHangExample;
import com.LTNC.LTNC_Java.model.CT_DonHangKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CT_DonHangMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    long countByExample(CT_DonHangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByExample(CT_DonHangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByPrimaryKey(CT_DonHangKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insert(CT_DonHang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insertSelective(CT_DonHang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<CT_DonHang> selectByExample(CT_DonHangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    CT_DonHang selectByPrimaryKey(CT_DonHangKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") CT_DonHang record, @Param("example") CT_DonHangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExample(@Param("record") CT_DonHang record, @Param("example") CT_DonHangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKeySelective(CT_DonHang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CT_DonHang
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKey(CT_DonHang record);
}