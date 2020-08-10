package com.zs.pharmaFinal.model;


import java.io.Serializable;

public class SalesRep implements Serializable {

        private static final long serialVersionUID = 1L;
        private Long id;
        private String name;
        private String region;
        private double openingSales;
        private double closingSales;

        public SalesRep()
        {
        }
        public SalesRep(Long id, String name, String region, double openingSales, double closingSales)
        {
            this.id = id;
            this.name = name;
            this.region = region;
            this.openingSales = openingSales;
            this.closingSales=closingSales;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public double getOpeningSales() {
            return openingSales;
        }

        public void setOpeningSales(double openingSales) {
            this.openingSales = openingSales;
        }

        public double getClosingSales() {
            return closingSales;
        }

        public void setClosingSales(double closingSales) {
            this.closingSales = closingSales;
        }

        // Changes made in toString Function
        @Override
        public String toString() {
            return "Customer [id=" + id + ", name=" + name + ", region=" + region
                    + " openingSales=" + openingSales + ", closingSales="+ closingSales +"]";
        }
    }
