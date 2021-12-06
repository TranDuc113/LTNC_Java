package com.LTNC.LTNC_Java.mapper;

import com.LTNC.LTNC_Java.model.LienHe;
import com.LTNC.LTNC_Java.model.LienHeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LienHeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    long countByExample(LienHeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByExample(LienHeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int deleteByPrimaryKey(Integer idlienhe);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insert(LienHe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int insertSelective(LienHe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    List<LienHe> selectByExample(LienHeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    LienHe selectByPrimaryKey(Integer idlienhe);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") LienHe record, @Param("example") LienHeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByExample(@Param("record") LienHe record, @Param("example") LienHeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKeySelective(LienHe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    int updateByPrimaryKey(LienHe record);
}