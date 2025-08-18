"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Personal = void 0;
var Personal = /** @class */ (function () {
    function Personal(firstName, lastName, phone, address, dateOfAnniversary, specialDate, location, relation, profilePic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.contactType = 'personal';
        this.dateOfAnniversary = dateOfAnniversary;
        this.specialDate = specialDate;
        this.location = location;
        this.relation = relation;
        this.profilePic = profilePic;
    }
    return Personal;
}());
exports.Personal = Personal;
