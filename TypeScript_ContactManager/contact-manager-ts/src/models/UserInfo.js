"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UserInfo = void 0;
var UserInfo = /** @class */ (function () {
    function UserInfo(username, password, emailId) {
        this.contactIds = [];
        this.username = username;
        this.password = password;
        this.emailId = emailId;
    }
    UserInfo.prototype.addContact = function (contact) {
        this.contactIds.push(contact);
    };
    UserInfo.prototype.getAllContacts = function () {
        return this.contactIds;
    };
    return UserInfo;
}());
exports.UserInfo = UserInfo;
