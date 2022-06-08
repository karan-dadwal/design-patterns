package com.scaler.lld.design.structural.decorator;

// Step 1 - Implement common interface
public class BaseDataSource implements DataSource {

    // Step 2 - Accept current entity in constructor
    public DataSource dataSource;

    public BaseDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
        return dataSource.read();
    }

    @Override
    public void write(String value) {
        dataSource.write(value);        
    }
    
}
