/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.notification.dao.gen;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.killbill.billing.plugin.notification.dao.gen.tables.EmailNotificationsConfiguration;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Killbill extends SchemaImpl {

    private static final long serialVersionUID = -1319254969;

    /**
     * The reference instance of <code>killbill</code>
     */
    public static final Killbill KILLBILL = new Killbill();

    /**
     * The table <code>killbill.email_notifications_configuration</code>.
     */
    public final EmailNotificationsConfiguration EMAIL_NOTIFICATIONS_CONFIGURATION = org.killbill.billing.plugin.notification.dao.gen.tables.EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION;

    /**
     * No further instances allowed
     */
    private Killbill() {
        super("killbill", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            EmailNotificationsConfiguration.EMAIL_NOTIFICATIONS_CONFIGURATION);
    }
}
