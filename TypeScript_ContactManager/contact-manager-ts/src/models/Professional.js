"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Professional = void 0;
var Professional = /** @class */ (function () {
    function Professional(firstName, lastName, phone, address, email, designation, organizationName, businessCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.contactType = 'professional';
        this.email = email;
        this.designation = designation;
        this.organizationName = organizationName;
        this.businessCard = businessCard;
    }
    return Professional;
}());
exports.Professional = Professional;
