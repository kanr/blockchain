/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CheckersApi
 */
@Ignore
public class CheckersApiTest {

    private final CheckersApi api = new CheckersApi();

    
    /**
     * Check validity of application configuration for Workbench
     *
     * Checks a configuration file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkApplicationPostTest() throws ApiException {
        File file = null;
        Integer response = api.checkApplicationPost(file);

        // TODO: test validations
    }
    
    /**
     * Check validity of application ledger implementation for Workbench
     *
     * Checks a ledger implementation file against configuration file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkContractCodePostTest() throws ApiException {
        Integer ledgerId = null;
        Integer response = api.checkContractCodePost(ledgerId);

        // TODO: test validations
    }
    
}