package org.ig.grails.plugin.delecious

class DeliciousResponse<T> {

    public T entity
    public int status

    public boolean success() {
        return this.status == 200 || this.status == 201
    }

    public String toString() {
        return "Delicious Response: Status: ${status}, Response Entity: ${entity}"
    }
}
