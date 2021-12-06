package com.LTNC.LTNC_Java.mapper;

import com.LTNC.LTNC_Java.model.DanhGia;
import com.LTNC.LTNC_Java.model.DanhGiaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DanhGiaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    long countByExample(DanhGiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByExample(DanhGiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insert(DanhGia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insertSelective(DanhGia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<DanhGia> selectByExample(DanhGiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") DanhGia record, @Param("example") DanhGiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExample(@Param("record") DanhGia record, @Param("example") DanhGiaExample example);
}