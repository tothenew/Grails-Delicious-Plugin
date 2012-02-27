package org.ig.grails.plugin.delecious

import del.icio.us.Delicious

class DeliciousPost {

    Delicious deliciousConnection

    String url = ""
    String description = ""
    String notes

    List<String> tags = []

    Date date = new Date()

    Boolean replace = false
    Boolean shared = true

    public dateInDeliciousFormat() {
        return date.format("YYYY-MM-DDThh:mm:ssZ")
    }

}
