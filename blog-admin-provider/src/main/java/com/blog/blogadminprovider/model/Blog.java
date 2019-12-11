package com.blog.blogadminprovider.model;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * 博客文章表
 *
 * @author **
 * @email **
 * @date 2019-10-17 14:53:31
 */
public class Blog {

    private String id;
    /**
     * 编码
     */

    private String blogCode;
    /**
     * 博客标题
     */
    private String blogTitle;
    /**
     * 博客类别
     */
    private String blogType;
    /**
     * 博客内容
     */
    private String blogContent;
    /**
     * 评论数
     */
    private Integer blogCount;
    /**
     * 发布人编码
     */
    private String dealUserId;
    /**
     * 发布人名称
     */
    private String dealUserName;
    /**
     * 发布时间
     */
    private Date dealTime;
    /**
     * 机构说明
     */
    private String remark;


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getId() {
        return id;
    }

    public void setBlogCode(String blogCode) {
        this.blogCode = blogCode == null ? null : blogCode.trim();
    }

    public String getBlogCode() {
        return blogCode;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType == null ? null : blogType.trim();
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }

    public Integer getBlogCount() {
        return blogCount;
    }

    public void setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId == null ? null : dealUserId.trim();
    }

    public String getDealUserId() {
        return dealUserId;
    }

    public void setDealUserName(String dealUserName) {
        this.dealUserName = dealUserName == null ? null : dealUserName.trim();
    }

    public String getDealUserName() {
        return dealUserName;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark() {
        return remark;
    }


    @Override
    public String toString() {
        return "Blog{\n" +
                "id=" + id + ",\n" +
                "blogCode=" + blogCode + ",\n" +
                "blogTitle=" + blogTitle + ",\n" +
                "blogType=" + blogType + ",\n" +
                "blogContent=" + blogContent + ",\n" +
                "blogCount=" + blogCount + ",\n" +
                "dealUserId=" + dealUserId + ",\n" +
                "dealUserName=" + dealUserName + ",\n" +
                "dealTime=" + dealTime + ",\n" +
                "remark=" + remark + ",\n" +
                "}";
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Blog == false) return false;
        if (this == obj) return true;
        Blog other = (Blog) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

