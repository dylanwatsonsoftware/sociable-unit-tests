package com.dylanwatsonsoftware.sociable.pricing;

import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true, chain = true)
public class Price {
    String id;
    String name;
    double marginPercent;
    double minMarginPercent;
    double cost;

    public int bestQty;
}
