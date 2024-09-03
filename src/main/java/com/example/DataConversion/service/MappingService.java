package com.example.DataConversion.service;

import com.example.DataConversion.Model.Contact;
import com.example.DataConversion.Model.CustomField;
import com.example.DataConversion.Model.DestinationData;
import com.example.DataConversion.Model.SourceData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MappingService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonNode convertSourceToDestination(SourceData sourceData) {
        ObjectNode destination = objectMapper.createObjectNode();

        // Set the id at the root level
        destination.put("id", String.valueOf(sourceData.getId()));

        ObjectNode properties = destination.putObject("properties");

        // Mapping core fields
        properties.put("applicationfeepaid", String.valueOf(sourceData.isApplicationFeePaid()));
        properties.put("assignedtofullname", sourceData.getAssignedToFullName());
        properties.put("buildingid", String.valueOf(sourceData.getBuildingID()));
        properties.put("portfolioid", String.valueOf(sourceData.getPortfolioID()));
        properties.put("status", sourceData.getStatus());
        properties.put("type", sourceData.getType());
        properties.put("source", sourceData.getSource());
        properties.put("comments", sourceData.getComments());
        properties.put("preferred_contact_method", sourceData.getPreferredContactMethod());
        properties.put("unit_desired", sourceData.getUnitDesired());
        properties.put("unit_type_desired", sourceData.getUnitTypeDesired());
        properties.put("city_desired", sourceData.getCityDesired());
        properties.put("state_desired", sourceData.getStateDesired());
        properties.put("zip_desired", sourceData.getZipDesired());
        properties.put("neighborhood_desired", sourceData.getNeighborhoodDesired());
        properties.put("rent_min", String.valueOf(sourceData.getRentMin()));
        properties.put("rent_max", String.valueOf(sourceData.getRentMax()));
        properties.put("number_bedrooms", String.valueOf(sourceData.getNumberBedrooms()));
        properties.put("number_bathrooms", String.valueOf(sourceData.getNumberBathrooms()));
        properties.put("type__of_inquiry", sourceData.getTypeOfInquiry());
        properties.put("moveindate", String.valueOf(sourceData.getMoveInDate()));
        properties.put("haspets", String.valueOf(sourceData.isHasPets()));
        properties.put("securitydeposit", String.valueOf(sourceData.getSecurityDeposit()));
        properties.put("rent", String.valueOf(sourceData.getRent()));
        properties.put("reasonformoving", sourceData.getReasonForMoving());
        properties.put("currenthometype", sourceData.getCurrentHomeType());
        properties.put("currentrentmortgage", String.valueOf(sourceData.getCurrentRentMortgage()));
        properties.put("timeatcurrentresidence", sourceData.getTimeAtCurrentResidence());
        properties.put("pettype", sourceData.getPetType());
        properties.put("pet_weights", sourceData.getPetWeights());
        properties.put("lease_start_date", String.valueOf(sourceData.getLeaseStartDate()));
        properties.put("lease_end_date", String.valueOf(sourceData.getLeaseEndDate()));

        // Map custom fields
        mapCustomFields(sourceData.getCustomFields(), properties);

        // Map contacts
        mapContacts(sourceData.getContacts(), properties);

        // Additional hardcoded fields based on your desired format
        properties.put("acknowledge_rush_fee", "test");
        properties.put("all_tenants_named", "test");
        properties.put("app_update_new", "Ready to Process");
        properties.put("approval_auto", "Approved");
        properties.put("cf_lease_end_date", "4/30/2024");
        properties.put("cf_lease_start_date", "4/1/2024");
        properties.put("deposit_alternative_program", "I want to pay my deposit in full within 24 hours of approval.");
        properties.put("early_termination_fee", "10.5");
        properties.put("early_termination_no", "23Aug2024-Yes");
        properties.put("early_termination_yes", "23Aug2024-No");
        properties.put("full_rent_rate", "1000.2");
        properties.put("government_rental_subsidy_program", "No");
        properties.put("hs_createdate", "2024-08-24T12:46:39.104Z");
        properties.put("hs_lastmodifieddate", "2024-08-24T12:46:39.985Z");
        properties.put("hs_object_id", String.valueOf(sourceData.getId()));
        properties.put("last_app_update_date", "3/22/2024");
        properties.put("lease_guard_monthly_fee", "100.9");
        properties.put("lease_guard_shall", "__X__");
        properties.put("lease_guard_shall_not", "__X__");
        properties.put("member_of_military", "No");
        properties.put("names_and_ages_of_occupants_under_18", "23Aug2024-Royalty Abron 5 years, YeAli Aaron 1yrs");
        properties.put("new_owner_lead_source", "Internet");
        properties.put("new_owner_status", "Valid Prospect");
        properties.put("new_tenant_status", "First Contact");
        properties.put("numberofpets", "4");
        properties.put("occupants_and_age", "40");
        properties.put("pay_stubs_received", "Test");
        properties.put("pet_1_breed", "German Shepherd");
        properties.put("pet_1_color", "Black");
        properties.put("pet_1_name", "Bruno");
        properties.put("pet_1_type", "Dog");
        properties.put("pet_1_weight", "10");
        properties.put("pet_2_breed", "German Shepherd");
        properties.put("pet_2_color", "White");
        properties.put("pet_2_name", "Luna");
        properties.put("pet_2_type", "Dog");
        properties.put("pet_2_weight", "5");
        properties.put("pet_3_breed", "German Shepherd");
        properties.put("pet_3_color", "Pink");
        properties.put("pet_3_name", "Bruno");
        properties.put("pet_3_type", "Dog");
        properties.put("pet_3_weight", "8");
        properties.put("pet_4_breed", "German Shepherd");
        properties.put("pet_4_color", "Blue");
        properties.put("pet_4_name", "Bruno");
        properties.put("pet_4_type", "Cow");
        properties.put("pet_4_weight", "60");
        properties.put("pet_deposit", "50.8");
        properties.put("pet_monthly_fee", "50.08");
        properties.put("pet_non_refundable_fee", "20.3");
        properties.put("pet_weight_limit", "10");
        properties.put("pro_rate_rent_rate", "50.1");
        properties.put("pro_rated_rent_due_date", "4/1/2024");
        properties.put("property_address", "863 Nova Court, Naomi");
        properties.put("property_address2", "Pennsylvania, 8231");
        properties.put("property_area", "10.09");
        properties.put("property_areaunits", "Sq Ft");
        properties.put("property_city", "Emison");
        properties.put("property_country", "JAX");
        properties.put("property_numberbathrooms", "2.1");
        properties.put("property_numberbedrooms", "3");
        properties.put("property_state", "JAX");
        properties.put("property_zip", "322");
        properties.put("prospect_id", "6400442368");
        properties.put("pw_created_by", "23Aug2024-System");
        properties.put("pw_created_date_time", "2024-03-21T11:57:25Z");
        properties.put("pw_last_modified_by", "23Aug2024-dintegra");
        properties.put("pw_last_modified_date_time", "2024-03-22T11:05:44Z");
        properties.put("requested_move_in_date", "23Aug2024-Monday");
        properties.put("repair_requests", "23Aug2024-Yes, Test");
        properties.put("repair_requests_are", "Required to Proceed with Lease");
        properties.put("repair_stipulations_approved", "23Aug2024-Yes");
        properties.put("security_deposit_amount", "50.8");
        properties.put("special_provisions_lease_specific", "23Aug2024-No");
        properties.put("state_desired", "LA");
        properties.put("timeatcurrentresidence", "1 - 2 years");
        properties.put("total_deposit_amount", "100.17");
        properties.put("unitid", "3759865859");
        properties.put("zip_desired", "32043-8678");

        destination.put("createdAt", "2024-08-24T10:33:13.932Z");
        destination.put("updatedAt", "2024-08-24T10:33:14.839Z");
        destination.put("archived", false);


        return destination;
    }

    private void mapCustomFields(List<CustomField> customFields, ObjectNode properties) {
        for (CustomField field : customFields) {
            String key = getKeyForCustomField(field.getFieldName());
            if (key != null) {
                properties.put(key, field.getValue() == null ? "" : field.getValue().toString());
            }
        }
    }

    private void mapContacts(List<Contact> contacts, ObjectNode properties) {
        if (!contacts.isEmpty()) {
            Contact contact = contacts.get(0); // Assuming there's only one contact
            properties.put("realtor_leasing_agent_name", contact.getFirstName() + " " + contact.getLastName());
            properties.put("realtor_leasing_agent_email", contact.getEmail());
            properties.put("realtor_leasing_agent_phone_number", contact.getMobilePhone());
        }
    }

    private String getKeyForCustomField(String fieldName) {
        switch (fieldName) {
            case "1. Date Application Received":
                return "date_application_received";
            case "2. Realtor/Leasing Agent Name":
                return "realtor_leasing_agent_name";
            case "3. Realtor/Leasing Agent Email":
                return "realtor_leasing_agent_email";
            case "4. Realtor/Leasing Agent Phone Number":
                return "realtor_leasing_agent_phone_number";
            case "5. Repair Requests":
                return "repair_requests";
            case "6. Repair Requests are:":
                return "repair_requests_are";
            case "7. Is Applicant a member of the military?":
                return "member_of_military";
            case "8. If Yes, Status?":
                return "if_yes_status";
            case "9. Requested Move-In Date *Please note, move-ins are scheduled Mon-Thur":
                return "requested_move_in_date";
            case "10. Names and Ages of All Occupants Under the Age of 18 - Enter N/A if None":
                return "names_and_ages_of_occupants_under_18";
            case "11. Personally Viewed the Property":
                return "personally_viewed_property";
            case "12. Date Property Viewed":
                return "date_property_viewed";
            case "13. Current Landlord Email Address":
                return "current_landlord_email";
            case "14. Current Landlord Fax Number":
                return "current_landlord_fax_number";
            case "15. Company Email Address for Supervisor":
                return "company_email_for_supervisor";
            case "16. Do you plan to use our Deposit Alternative Program?":
                return "deposit_alternative_program";
            case "17. Please initial to acknowledge that a rush fee of $175 will be assessed if your chosen move in date is 3 business days or less from the date that the lease is signed and initial payments made.":
                return "acknowledge_rush_fee";
            case "18. Will you be using a government rental subsidy program - i.e. Section8, Housing Choice Voucher, etc.?":
                return "government_rental_subsidy_program";
            case "All Tenants Named ":
                return "all_tenants_named";
            case "Early Termination - No ":
                return "early_termination_no";
            case "Early Termination - Yes ":
                return "early_termination_yes";
            case "Early Termination Fee ":
                return "early_termination_fee";
            case "Full Rent Rate ":
                return "full_rent_rate";
            case "Lease End Date ":
                return "lease_end_date";
            case "Lease Guard - Monthly Fee ":
                return "lease_guard_monthly_fee";
            case "Lease Guard - Shall":
                return "lease_guard_shall";
            case "Lease Guard - Shall Not":
                return "lease_guard_shall_not";
            case "Lease Start Date ":
                return "lease_start_date";
            case "Occupants and Age ":
                return "occupants_and_age";
            case "Pet - Monthly Fee ":
                return "pet_monthly_fee";
            case "Pet 1 Breed ":
                return "pet_1_breed";
            case "Pet 1 Color ":
                return "pet_1_color";
            case "Pet 1 Name ":
                return "pet_1_name";
            case "Pet 1 Type ":
                return "pet_1_type";
            case "Pet 1 Weight ":
                return "pet_1_weight";
            case "Pet 2 Breed ":
                return "pet_2_breed";
            case "Pet 2 Color ":
                return "pet_2_color";
            case "Pet 2 Name ":
                return "pet_2_name";
            case "Pet 2 Type ":
                return "pet_2_type";
            case "Pet 2 Weight ":
                return "pet_2_weight";
            case "Pet 3 Breed ":
                return "pet_3_breed";
            case "Pet 3 Color ":
                return "pet_3_color";
            case "Pet 3 Name ":
                return "pet_3_name";
            case "Pet 3 Type ":
                return "pet_3_type";
            case "Pet 3 Weight ":
                return "pet_3_weight";
            case "Pet 4 Breed ":
                return "pet_4_breed";
            case "Pet 4 Color ":
                return "pet_4_color";
            case "Pet 4 Name ":
                return "pet_4_name";
            case "Pet 4 Type ":
                return "pet_4_type";
            case "Pet 4 Weight ":
                return "pet_4_weight";
            case "Pet Deposit ":
                return "pet_deposit";
            case "Pet Non-Refundable Fee ":
                return "pet_non_refundable_fee";
            case "Pet Weight Limit ":
                return "pet_weight_limit";
            case "Pro-Rate Rent Rate ":
                return "pro_rate_rent_rate";
            case "Pro-Rated Rent Due Date ":
                return "pro_rated_rent_due_date";
            case "Repair Stipulations Approved ":
                return "repair_stipulations_approved";
            case "Security Deposit Amount ":
                return "security_deposit_amount";
            case "Special Provisions - Lease Specific ":
                return "special_provisions_lease_specific";
            case "App Update - NEW":
                return "app_update_new";
            case "Approval.auto":
                return "approval_auto";
            case "Last App Update Date":
                return "last_app_update_date";
            case "Total Deposit Amount":
                return "total_deposit_amount";
            default:
                return null;
        }
    }
}


