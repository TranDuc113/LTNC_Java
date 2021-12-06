package com.LTNC.LTNC_Java.mapper;

import com.LTNC.LTNC_Java.model.ThuongHieu;
import com.LTNC.LTNC_Java.model.ThuongHieuExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ThuongHieuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    long countByExample(ThuongHieuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByExample(ThuongHieuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByPrimaryKey(Integer idthuonghieu);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insert(ThuongHieu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insertSelective(ThuongHieu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<ThuongHieu> selectByExample(ThuongHieuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    ThuongHieu selectByPrimaryKey(Integer idthuonghieu);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") ThuongHieu record, @Param("example") ThuongHieuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExample(@Param("record") ThuongHieu record, @Param("example") ThuongHieuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKeySelective(ThuongHieu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKey(ThuongHieu record);
}