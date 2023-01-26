package com.yjj.yjjshopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName shopping
 */
@TableName(value ="shopping")
@Data
public class Shopping implements Serializable{
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer sid;

    /**
     * 
     */
    private String sname;

    /**
     * 
     */
    private String sdescribe;

    /**
     * 
     */
    private Double soriginalprice;

    /**
     * 
     */
    private Double scurrentprice;

    /**
     * 
     */
    private Integer sremain;

    /**
     * 
     */
    private String sphoto;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Shopping other = (Shopping) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSdescribe() == null ? other.getSdescribe() == null : this.getSdescribe().equals(other.getSdescribe()))
            && (this.getSoriginalprice() == null ? other.getSoriginalprice() == null : this.getSoriginalprice().equals(other.getSoriginalprice()))
            && (this.getScurrentprice() == null ? other.getScurrentprice() == null : this.getScurrentprice().equals(other.getScurrentprice()))
            && (this.getSremain() == null ? other.getSremain() == null : this.getSremain().equals(other.getSremain()))
            && (this.getSphoto() == null ? other.getSphoto() == null : this.getSphoto().equals(other.getSphoto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSdescribe() == null) ? 0 : getSdescribe().hashCode());
        result = prime * result + ((getSoriginalprice() == null) ? 0 : getSoriginalprice().hashCode());
        result = prime * result + ((getScurrentprice() == null) ? 0 : getScurrentprice().hashCode());
        result = prime * result + ((getSremain() == null) ? 0 : getSremain().hashCode());
        result = prime * result + ((getSphoto() == null) ? 0 : getSphoto().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", sdescribe=").append(sdescribe);
        sb.append(", soriginalprice=").append(soriginalprice);
        sb.append(", scurrentprice=").append(scurrentprice);
        sb.append(", sremain=").append(sremain);
        sb.append(", sphoto=").append(sphoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}