/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.notification.dao.gen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.notification.dao.gen.Indexes;
import org.killbill.billing.plugin.notification.dao.gen.Keys;
import org.killbill.billing.plugin.notification.dao.gen.Killbill;
import org.killbill.billing.plugin.notification.dao.gen.tables.records.EmailNotificationsConfigurationRecord;


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
public class EmailNotificationsConfiguration extends TableImpl<EmailNotificationsConfigurationRecord> {

    private static final long serialVersionUID = 1597491816;

    /**
     * The reference instance of <code>killbill.email_notifications_configuration</code>
     */
    public static final EmailNotificationsConfiguration EMAIL_NOTIFICATIONS_CONFIGURATION = new EmailNotificationsConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailNotificationsConfigurationRecord> getRecordType() {
        return EmailNotificationsConfigurationRecord.class;
    }

    /**
     * The column <code>killbill.email_notifications_configuration.record_id</code>.
     */
    public final TableField<EmailNotificationsConfigurationRecord, ULong> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>killbill.email_notifications_configuration.kb_account_id</code>.
     */
    public final TableField<EmailNotificationsConfigurationRecord, String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>killbill.email_notifications_configuration.kb_tenant_id</code>.
     */
    public final TableField<EmailNotificationsConfigurationRecord, String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>killbill.email_notifications_configuration.event_type</code>.
     */
    public final TableField<EmailNotificationsConfigurationRecord, String> EVENT_TYPE = createField("event_type", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>killbill.email_notifications_configuration.created_at</code>.
     */
    public final TableField<EmailNotificationsConfigurationRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>killbill.email_notifications_configuration</code> table reference
     */
    public EmailNotificationsConfiguration() {
        this(DSL.name("email_notifications_configuration"), null);
    }

    /**
     * Create an aliased <code>killbill.email_notifications_configuration</code> table reference
     */
    public EmailNotificationsConfiguration(String alias) {
        this(DSL.name(alias), EMAIL_NOTIFICATIONS_CONFIGURATION);
    }

    /**
     * Create an aliased <code>killbill.email_notifications_configuration</code> table reference
     */
    public EmailNotificationsConfiguration(Name alias) {
        this(alias, EMAIL_NOTIFICATIONS_CONFIGURATION);
    }

    private EmailNotificationsConfiguration(Name alias, Table<EmailNotificationsConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailNotificationsConfiguration(Name alias, Table<EmailNotificationsConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Killbill.KILLBILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_ACCOUNT_ID, Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_TENANT_ID, Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_ACCOUNT_ID, Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_KB_TENANT_ID, Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY, Indexes.EMAIL_NOTIFICATIONS_CONFIGURATION_RECORD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmailNotificationsConfigurationRecord, ULong> getIdentity() {
        return Keys.IDENTITY_EMAIL_NOTIFICATIONS_CONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailNotificationsConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailNotificationsConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailNotificationsConfigurationRecord>>asList(Keys.KEY_EMAIL_NOTIFICATIONS_CONFIGURATION_PRIMARY, Keys.KEY_EMAIL_NOTIFICATIONS_CONFIGURATION_RECORD_ID, Keys.KEY_EMAIL_NOTIFICATIONS_CONFIGURATION_KENUI_CONFIGURATION_EVENT_TYPE_KB_ACCOUNT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfiguration as(String alias) {
        return new EmailNotificationsConfiguration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailNotificationsConfiguration as(Name alias) {
        return new EmailNotificationsConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailNotificationsConfiguration rename(String name) {
        return new EmailNotificationsConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailNotificationsConfiguration rename(Name name) {
        return new EmailNotificationsConfiguration(name, null);
    }
}
