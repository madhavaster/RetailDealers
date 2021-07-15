package com.agrisutra.model.common;

import com.agrisutra.model.location.Village;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "retail_dealers")
public class RetailDealers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appId;
    private String applName;
    private String applHouseNo;
    private String applStreetName;
    private String appDate;
    @ManyToOne
    @JoinColumn(name = "appl_village_fk")
    private Village applVillage;
    private String mobileNo;
    private String contactNo;
    private String emailId;
    private String tinNo;
    private String panNo;
    private String saleHouseNo;
    private String saleStreetName;
    @ManyToOne
    @JoinColumn(name = "sale_village_fk")
    private Village saleVillage;
    private String storageHouseNo;
    private String storageStreetName;
    @ManyToOne
    @JoinColumn(name = "storage_village_fk")
    private Village storageVillage;
    private Integer years;
    private Integer months;
    private String challanNo;
    private String challanAmount;
    private String challanDate;
    private String challanBankName;
    private String challanBankBranch;
    private String challanBankDistrict;
    private String challanTreasuryName;
    private String challanTreasuryLocation;
    private String challanPaymentStatus;
    private Character isManufacturer;
    private Character isImporter;
    private Character isPoolhandlingAgency;
    private Character isRetailer;
    private Character isWholesaler;
    private String otherInfo;
    private String applicationType;
    private String sanctionOrderNo;
    private String dealerName;
    private Character isActive;
    private String application_number;
    private Integer parentId;
    private Integer oldApplicationId;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service serviceId;
    private Character isSalepointGodown;
    private String responsePersonName;
    private String responsePersonFathername;
    private String responsePersonAge;
    private String responsePersonDesg;
    private String responsePersonPreHouseno;
    private String responsePersonPreStreetname;
    @ManyToOne
    @JoinColumn(name = "respone_person_pre_village_fk")
    private Village responsePersonPreVillage;
    private String responsePersonPermHouseno;
    private String responsePersonPermStreetname;
    @ManyToOne
    @JoinColumn(name = "response_person_perm_village_fk")
    private Village responsePersonPermVillage;
    private String expiryDate;
    private String issueDate;
    @ManyToOne
    @JoinColumn(name = "license_fk")
    private License license;
    private String oldLicenseId;
}
