package com.girish.creationaldesignpattern.builder;

public class LunchOrderBean {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {}

        public LunchOrderBean build() {
            return new LunchOrderBean(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrderBean(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LunchOrderBean{");
        if(this.bread != null) {
            builder.append("bread='").append(bread).append("'");
            builder.append(", ");
        }

        if(this.condiments != null) {
            builder.append("condiments='").append(condiments).append("'");
            builder.append(", ");
        }

        if(this.dressing != null) {
            builder.append("dressing='").append(dressing).append("'");
            builder.append(", ");
        }

        if(this.meat != null) {
            builder.append("meat='").append(meat).append("'");
        }
        builder.append("}");

        return builder.toString();
    }
}
