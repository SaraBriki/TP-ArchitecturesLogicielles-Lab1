package com.directi.training.dip.solution.code;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        EncodingModule encodingModule = new EncodingModule();
        IDatabase database = new MyDatabase();
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase(database);
    }
}
