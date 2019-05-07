package com.apps.stackviewpager;

public class Recent_Model{

    private String organisation_chain, tender_refrence_number, tender_id,
            tender_fee, Emd_amount_in, Emd_exemption_allowed, work_description, tender_value_in,
            period_of_work, published_date, sale_end_date, nit_document;

    public Recent_Model() {
    }

    public String getOrganisation_chain() {
        return organisation_chain;
    }

    public void setOrganisation_chain(String organisation_chain) {
        this.organisation_chain = organisation_chain;
    }

    public String getTender_refrence_number() {
        return tender_refrence_number;
    }

    public void setTender_refrence_number(String tender_refrence_number) {
        this.tender_refrence_number = tender_refrence_number;
    }

    public String getTender_id() {
        return tender_id;
    }

    public void setTender_id(String tender_id) {
        this.tender_id = tender_id;
    }

    public String getTender_fee() {
        return tender_fee;
    }

    public void setTender_fee(String tender_fee) {
        this.tender_fee = tender_fee;
    }

    public String getEmd_amount_in() {
        return Emd_amount_in;
    }

    public void setEmd_amount_in(String emd_amount_in) {
        Emd_amount_in = emd_amount_in;
    }

    public String getEmd_exemption_allowed() {
        return Emd_exemption_allowed;
    }

    public void setEmd_exemption_allowed(String emd_exemption_allowed) {
        Emd_exemption_allowed = emd_exemption_allowed;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getTender_value_in() {
        return tender_value_in;
    }

    public void setTender_value_in(String tender_value_in) {
        this.tender_value_in = tender_value_in;
    }

    public String getPeriod_of_work() {
        return period_of_work;
    }

    public void setPeriod_of_work(String period_of_work) {
        this.period_of_work = period_of_work;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getSale_end_date() {
        return sale_end_date;
    }

    public void setSale_end_date(String sale_end_date) {
        this.sale_end_date = sale_end_date;
    }

    public String getNit_document() {
        return nit_document;
    }

    public void setNit_document(String nit_document) {
        this.nit_document = nit_document;
    }

    public Recent_Model(String organisation_chain, String tender_refrence_number, String tender_id, String tender_fee, String emd_amount_in, String emd_exemption_allowed, String work_description, String tender_value_in, String period_of_work, String published_date, String sale_end_date, String nit_document) {
        this.organisation_chain = organisation_chain;
        this.tender_refrence_number = tender_refrence_number;
        this.tender_id = tender_id;
        this.tender_fee = tender_fee;
        Emd_amount_in = emd_amount_in;
        Emd_exemption_allowed = emd_exemption_allowed;
        this.work_description = work_description;
        this.tender_value_in = tender_value_in;
        this.period_of_work = period_of_work;
        this.published_date = published_date;
        this.sale_end_date = sale_end_date;
        this.nit_document = nit_document;
    }
}
