package org.rest.sec.web.role;

import org.rest.common.client.IEntityOperations;
import org.rest.sec.client.template.RoleTestRestTemplate;
import org.rest.sec.model.Role;
import org.rest.sec.model.RoleEntityOpsImpl;
import org.rest.sec.test.SecMimeRestIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleMimeRestIntegrationTest extends SecMimeRestIntegrationTest<Role> {

    @Autowired
    private RoleTestRestTemplate api;
    @Autowired
    private RoleEntityOpsImpl entityOps;

    public RoleMimeRestIntegrationTest() {
        super();
    }

    // tests

    // template method

    @Override
    protected final RoleTestRestTemplate getApi() {
        return api;
    }

    @Override
    protected final IEntityOperations<Role> getEntityOps() {
        return entityOps;
    }

}
