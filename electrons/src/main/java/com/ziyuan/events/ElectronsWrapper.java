package com.ziyuan.events;

import java.lang.reflect.Type;

/**
 * ElectronsWrapper 事件的包装类
 *
 * @author ziyuan
 * @since 2017-03-08
 */
public final class ElectronsWrapper {

    /**
     * 事件的标签
     */
    private String tag;

    /**
     * 事件源
     */
    private Type source;

    public ElectronsWrapper(String tag, Type source) {
        this.tag = tag;
        this.source = source;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tag == null) ? 0 : tag.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ElectronsWrapper other = (ElectronsWrapper) obj;
        if (tag == null) {
            if (other.tag != null)
                return false;
        } else if (!tag.equals(other.tag))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        return true;
    }

    public String getTag() {
        return tag;
    }

    public String getSymbol() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.tag).append("-").append(((Class) this.source).getSimpleName());
        return builder.toString();
    }

    @Override
    public String toString() {
        return "ElectronsWrapper{" +
                "tag='" + tag + '\'' +
                ", source=" + source +
                '}';
    }
}
