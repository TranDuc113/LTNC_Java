package com.LTNC.LTNC_Java.mapper;

import com.LTNC.LTNC_Java.model.TinTuc;
import com.LTNC.LTNC_Java.model.TinTucExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TinTucMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    long countByExample(TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByExample(TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByPrimaryKey(Integer idtin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insert(TinTuc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insertSelective(TinTuc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<TinTuc> selectByExampleWithBLOBs(TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<TinTuc> selectByExample(TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    TinTuc selectByPrimaryKey(Integer idtin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") TinTuc record, @Param("example") TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleWithBLOBs(@Param("record") TinTuc record, @Param("example") TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExample(@Param("record") TinTuc record, @Param("example") TinTucExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKeySelective(TinTuc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKeyWithBLOBs(TinTuc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKey(TinTuc record);
}