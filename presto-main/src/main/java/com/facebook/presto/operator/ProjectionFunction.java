/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.presto.operator;

import com.facebook.presto.tuple.Tuple;
import com.facebook.presto.tuple.TupleInfo;
import com.facebook.presto.block.BlockBuilder;
import com.facebook.presto.block.BlockCursor;

public interface ProjectionFunction
{
    TupleInfo getTupleInfo();

    void project(BlockCursor[] cursors, BlockBuilder output);

    void project(Tuple[] tuples, BlockBuilder output);
}
