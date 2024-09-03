package com.example.DataConversion.service;

import com.example.DataConversion.Model.Contact;
import com.example.DataConversion.Model.CustomField;
import com.example.DataConversion.Model.SourceData;
import lombok.Getter;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class SourceAPIService {

    // Get the current SourceData object
    // Store the current state of the SourceData object
    private final SourceData sourceData;

    public SourceAPIService() {
        // Initialize with given data
        this.sourceData = new SourceData();
        this.sourceData.setId(6701187112L);
        this.sourceData.setLastModifiedBy("");
        this.sourceData.setLastModifiedDateTime(LocalDateTime.parse("2024-08-17T05:57:28"));
        this.sourceData.setCreatedBy("system");
        this.sourceData.setCreatedDateTime(LocalDateTime.parse("2024-08-16T21:54:34"));
        this.sourceData.setCustomFields(initializeCustomFields());
        this.sourceData.setUnitID(4591386631L);
        this.sourceData.setBuildingID(4591386631L);
        this.sourceData.setPortfolioID(4161994758L);
        this.sourceData.setStatus("Application In Progress");
        this.sourceData.setType("Tenant Applicant");
        this.sourceData.setSource("Website");
        this.sourceData.setComments(null);
        this.sourceData.setPreferredContactMethod(null);
        this.sourceData.setUnitDesired("BELIKOW,VSEV | ASHLAND220");
        this.sourceData.setUnitTypeDesired("Single Family Home");
        this.sourceData.setCityDesired(null);
        this.sourceData.setStateDesired(null);
        this.sourceData.setZipDesired(null);
        this.sourceData.setNeighborhoodDesired(null);
        this.sourceData.setRentMin(0.0);
        this.sourceData.setRentMax(0.0);
        this.sourceData.setNumberBedrooms(0);
        this.sourceData.setNumberBathrooms(0.0);
        this.sourceData.setTypeOfInquiry("Application");
        this.sourceData.setMoveInDate(LocalDate.parse("2024-09-13"));
        this.sourceData.setHasPets(false);
        this.sourceData.setAssignedToFullName("Stewart Hoy");
        this.sourceData.setLeaseStartDate(null);
        this.sourceData.setLeaseEndDate(null);
        this.sourceData.setSecurityDeposit(2050.0);
        this.sourceData.setRent(2050.0);
        this.sourceData.setApplicationFeePaid(false);
        this.sourceData.setPropertyAddress(null);
        this.sourceData.setPropertyAddress2(null);
        this.sourceData.setPropertyCity(null);
        this.sourceData.setPropertyState(null);
        this.sourceData.setPropertyZip(null);
        this.sourceData.setPropertyCountry(null);
        this.sourceData.setPropertyArea(0.0);
        this.sourceData.setPropertyAreaUnits("Sq Ft");
        this.sourceData.setPropertyNumberBedrooms(0);
        this.sourceData.setPropertyNumberBathrooms(0.0);
        this.sourceData.setNumberOfPets(0);
        this.sourceData.setReasonForMoving("");
        this.sourceData.setCurrentHomeType("");
        this.sourceData.setCurrentRentMortgage(0.0);
        this.sourceData.setTimeAtCurrentResidence("");
        this.sourceData.setPetType("");
        this.sourceData.setPetWeights("");
        this.sourceData.setContacts(initializeContacts());
    }

    // Initialize custom fields with provided values
    private List<CustomField> initializeCustomFields() {
        List<CustomField> customFields = new ArrayList<>();

        customFields.add(new CustomField("1. Date Application Received", null, "Date", 761102375L));
        customFields.add(new CustomField("2. Realtor/Leasing Agent Name", "", "Text", 761102364L));
        customFields.add(new CustomField("3. Realtor/Leasing Agent Email", "", "Text", 761102365L));
        customFields.add(new CustomField("4. Realtor/Leasing Agent Phone Number", "", "Text", 761102366L));
        customFields.add(new CustomField("5. Repair Requests", "", "Text", 761102367L));
        customFields.add(new CustomField("6. Repair Requests are:", "-", "Picklist", 760479925L));
        customFields.add(new CustomField("7. Is Applicant a member of the military?", "Yes", "Picklist", 760479924L));
        customFields.add(new CustomField("8. If Yes, Status?", "", "Text", 761102368L));
        customFields.add(new CustomField("9. Requested Move-In Date *Please note, move-ins are scheduled Mon-Thur", "", "Text", 761102369L));
        customFields.add(new CustomField("10. Names and Ages of All Occupants Under the Age of 18 - Enter N/A if None", "", "Text", 761102374L));
        customFields.add(new CustomField("11. Personally Viewed the Property", "Yes", "Picklist", 760479923L));
        customFields.add(new CustomField("12. Date Property Viewed", "8/16/2024", "Date", 761102376L));
        customFields.add(new CustomField("13. Current Landlord Email Address", "", "Text", 761102370L));
        customFields.add(new CustomField("14. Current Landlord Fax Number", "", "Text", 761102371L));
        customFields.add(new CustomField("App Update", "", "Text", 761102372L));
        customFields.add(new CustomField("Pay Stubs Received", "", "Text", 761102373L));
        customFields.add(new CustomField("New Tenant Status", "Choose:", "Picklist", 760479922L));
        customFields.add(new CustomField("New Owner - Lead Source", "Choose:", "Picklist", 760479921L));
        customFields.add(new CustomField("New Owner Status", "Choose:", "Picklist", 760479920L));
        customFields.add(new CustomField("15. Company Email Address for Supervisor", "", "Text", 1285652482L));
        customFields.add(new CustomField("16. Do you plan to use our Deposit Alternative Program?", "Please tell me more about this!", "Picklist", 1105756168L));
        customFields.add(new CustomField("17. Please initial to acknowledge that a rush fee of $175 will be assessed if your chosen move in date is 3 business days or less from the date that the lease is signed and initial payments made.", "", "Text", 1250033666L));
        customFields.add(new CustomField("18. Will you be using a government rental subsidy program - i.e. Section8, Housing Choice Voucher, etc.?", "No", "Picklist", 1398898689L));
        customFields.add(new CustomField("All Tenants Named ", "", "Text", 1645936841L));
        customFields.add(new CustomField("Early Termination - No ", "", "Text", 1645936852L));
        customFields.add(new CustomField("Early Termination - Yes ", "", "Text", 1645936853L));
        customFields.add(new CustomField("Early Termination Fee ", "0.0", "Currency", 1645936851L));
        customFields.add(new CustomField("Full Rent Rate ", "0.0", "Currency", 1645936844L));
        customFields.add(new CustomField("Lease End Date ", null, "Date", 1645936843L));
        customFields.add(new CustomField("Lease Guard - Monthly Fee ", "0.0", "Currency", 1645936840L));
        customFields.add(new CustomField("Lease Guard - Shall", "_____", "Picklist", 1645936878L));
        customFields.add(new CustomField("Lease Guard - Shall Not", "_____", "Picklist", 1645936879L));
        customFields.add(new CustomField("Lease Start Date ", null, "Date", 1645936842L));
        customFields.add(new CustomField("Occupants and Age ", "", "Text", 1645936848L));
        customFields.add(new CustomField("Pet - Monthly Fee ", "0.0", "Currency", 1645936854L));
        customFields.add(new CustomField("Pet 1 Breed ", "", "Text", 1645936858L));
        customFields.add(new CustomField("Pet 1 Color ", "", "Text", 1645936859L));
        customFields.add(new CustomField("Pet 1 Name ", "", "Text", 1645936860L));
        customFields.add(new CustomField("Pet 1 Type ", "", "Text", 1645936861L));
        customFields.add(new CustomField("Pet 1 Weight ", "", "Text", 1645936862L));
        customFields.add(new CustomField("Pet 2 Breed ", "", "Text", 1645936863L));
        customFields.add(new CustomField("Pet 2 Color ", "", "Text", 1645936864L));
        customFields.add(new CustomField("Pet 2 Name ", "", "Text", 1645936865L));
        customFields.add(new CustomField("Pet 2 Type ", "", "Text", 1645936866L));
        customFields.add(new CustomField("Pet 2 Weight ", "", "Text", 1645936867L));
        customFields.add(new CustomField("Pet 3 Breed ", "", "Text", 1645936868L));
        customFields.add(new CustomField("Pet 3 Color ", "", "Text", 1645936869L));
        customFields.add(new CustomField("Pet 3 Name ", "", "Text", 1645936870L));
        customFields.add(new CustomField("Pet 3 Type ", "", "Text", 1645936871L));
        customFields.add(new CustomField("Pet 3 Weight ", "", "Text", 1645936872L));
        customFields.add(new CustomField("Pet 4 Breed ", "", "Text", 1645936873L));
        customFields.add(new CustomField("Pet 4 Color ", "", "Text", 1645936874L));
        customFields.add(new CustomField("Pet 4 Name ", "", "Text", 1645936875L));
        customFields.add(new CustomField("Pet 4 Type ", "", "Text", 1645936876L));
        customFields.add(new CustomField("Pet 4 Weight ", "", "Text", 1645936877L));
        customFields.add(new CustomField("Pet Deposit ", "0.0", "Currency", 1645936855L));
        customFields.add(new CustomField("Pet Non-Refundable Fee ", "0.0", "Currency", 1645936856L));
        customFields.add(new CustomField("Pet Weight Limit ", "", "Text", 1645936857L));
        customFields.add(new CustomField("Pro-Rate Rent Rate ", "0.0", "Currency", 1645936846L));
        customFields.add(new CustomField("Pro-Rated Rent Due Date ", null, "Date", 1645936845L));
        customFields.add(new CustomField("Repair Stipulations Approved ", "", "Text", 1645936849L));
        customFields.add(new CustomField("Security Deposit Amout ", "0.0", "Currency", 1645936847L));
        customFields.add(new CustomField("Special Provisions - Lease Specific ", "", "Memo", 1645936850L));
        customFields.add(new CustomField("App Update - NEW", "Choose:", "Picklist", 1315667972L));
        customFields.add(new CustomField("Approval.auto", "-", "Picklist", 1354989570L));
        customFields.add(new CustomField("Last App Update Date", null, "Date", 1315667973L));
        customFields.add(new CustomField("Total Deposit Amount", "0.0", "Currency", 1354989571L));

        return customFields;
    }

    // Initialize contacts with provided values
    private List<Contact> initializeContacts() {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(6995804238L, "Austin", "Pez", "Pez.austin01@gmail.com", "(812) 363-4750", "", "(812) 363-4750", "Applicant"));

        return contacts;
    }

    // Method to add or update custom fields in the SourceData object
    public void addCustomField(CustomField customField) {
        List<CustomField> customFields = this.sourceData.getCustomFields();
        customFields.add(customField);
        this.sourceData.setCustomFields(customFields);
    }

    // Method to update or add a contact
    public void addContact(Contact contact) {
        List<Contact> contacts = this.sourceData.getContacts();
        contacts.add(contact);
        this.sourceData.setContacts(contacts);
    }

    // Method to update fields in the SourceData object
    public void updateSourceField(String fieldName, Object value) {
        switch (fieldName) {
            case "id":
                this.sourceData.setId((Long) value);
                break;
            case "lastModifiedBy":
                this.sourceData.setLastModifiedBy((String) value);
                break;
            case "lastModifiedDateTime":
                this.sourceData.setLastModifiedDateTime((LocalDateTime) value);
                break;
            case "createdBy":
                this.sourceData.setCreatedBy((String) value);
                break;
            case "createdDateTime":
                this.sourceData.setCreatedDateTime((LocalDateTime) value);
                break;
            case "unitID":
                this.sourceData.setUnitID((Long) value);
                break;
            case "buildingID":
                this.sourceData.setBuildingID((Long) value);
                break;
            case "portfolioID":
                this.sourceData.setPortfolioID((Long) value);
                break;
            case "status":
                this.sourceData.setStatus((String) value);
                break;
            case "type":
                this.sourceData.setType((String) value);
                break;
            case "source":
                this.sourceData.setSource((String) value);
                break;
            case "comments":
                this.sourceData.setComments((String) value);
                break;
            case "preferredContactMethod":
                this.sourceData.setPreferredContactMethod((String) value);
                break;
            case "unitDesired":
                this.sourceData.setUnitDesired((String) value);
                break;
            case "unitTypeDesired":
                this.sourceData.setUnitTypeDesired((String) value);
                break;
            case "cityDesired":
                this.sourceData.setCityDesired((String) value);
                break;
            case "stateDesired":
                this.sourceData.setStateDesired((String) value);
                break;
            case "zipDesired":
                this.sourceData.setZipDesired((String) value);
                break;
            case "neighborhoodDesired":
                this.sourceData.setNeighborhoodDesired((String) value);
                break;
            case "rentMin":
                this.sourceData.setRentMin((Double) value);
                break;
            case "rentMax":
                this.sourceData.setRentMax((Double) value);
                break;
            case "numberBedrooms":
                this.sourceData.setNumberBedrooms((Integer) value);
                break;
            case "numberBathrooms":
                this.sourceData.setNumberBathrooms((Double) value);
                break;
            case "typeOfInquiry":
                this.sourceData.setTypeOfInquiry((String) value);
                break;
            case "moveInDate":
                this.sourceData.setMoveInDate((LocalDate) value);
                break;
            case "hasPets":
                this.sourceData.setHasPets((Boolean) value);
                break;
            case "assignedToFullName":
                this.sourceData.setAssignedToFullName((String) value);
                break;
            case "leaseStartDate":
                this.sourceData.setLeaseStartDate((LocalDate) value);
                break;
            case "leaseEndDate":
                this.sourceData.setLeaseEndDate((LocalDate) value);
                break;
            case "securityDeposit":
                this.sourceData.setSecurityDeposit((Double) value);
                break;
            case "rent":
                this.sourceData.setRent((Double) value);
                break;
            case "applicationFeePaid":
                this.sourceData.setApplicationFeePaid((Boolean) value);
                break;
            case "propertyAddress":
                this.sourceData.setPropertyAddress((String) value);
                break;
            case "propertyAddress2":
                this.sourceData.setPropertyAddress2((String) value);
                break;
            case "propertyCity":
                this.sourceData.setPropertyCity((String) value);
                break;
            case "propertyState":
                this.sourceData.setPropertyState((String) value);
                break;
            case "propertyZip":
                this.sourceData.setPropertyZip((String) value);
                break;
            case "propertyCountry":
                this.sourceData.setPropertyCountry((String) value);
                break;
            case "propertyArea":
                this.sourceData.setPropertyArea((Double) value);
                break;
            case "propertyAreaUnits":
                this.sourceData.setPropertyAreaUnits((String) value);
                break;
            case "propertyNumberBedrooms":
                this.sourceData.setPropertyNumberBedrooms((Integer) value);
                break;
            case "propertyNumberBathrooms":
                this.sourceData.setPropertyNumberBathrooms((Double) value);
                break;
            case "numberOfPets":
                this.sourceData.setNumberOfPets((Integer) value);
                break;
            case "reasonForMoving":
                this.sourceData.setReasonForMoving((String) value);
                break;
            case "currentHomeType":
                this.sourceData.setCurrentHomeType((String) value);
                break;
            case "currentRentMortgage":
                this.sourceData.setCurrentRentMortgage((Double) value);
                break;
            case "timeAtCurrentResidence":
                this.sourceData.setTimeAtCurrentResidence((String) value);
                break;
            case "petType":
                this.sourceData.setPetType((String) value);
                break;
            case "petWeights":
                this.sourceData.setPetWeights((String) value);
                break;
            default:
                throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

}

