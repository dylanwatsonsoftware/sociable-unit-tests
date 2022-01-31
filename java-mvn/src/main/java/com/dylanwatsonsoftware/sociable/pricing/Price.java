package com.dylanwatsonsoftware.sociable.pricing;

import lombok.Value;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Value
@Accessors(fluent = true, chain = true)
public class Price {

    @Id
    String id;

    String name;
    double marginPercent;
    double minMarginPercent;
    double cost;

    public int bestQty;
}
