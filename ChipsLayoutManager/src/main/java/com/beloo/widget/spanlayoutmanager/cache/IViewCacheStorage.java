package com.beloo.widget.spanlayoutmanager.cache;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.Pair;
import android.view.View;

import java.util.List;

public interface IViewCacheStorage {

    boolean isPositionEndsRow(int position);

    boolean isPositionStartsRow(int position);

    void setCachingEnabled(boolean isEnabled);

    void storeRow(List<Pair<Rect, View>> row);

    boolean isInCache(int position);

    /** purge whole cache*/
    void purge();

    /** all cache to selected position will be purged
     * @param position the end position, exclusive */
    void purgeCacheToPosition(int position);

    /** all cache from selected position will be purged
     * @param position the start position, inclusive */
    void purgeCacheFromPosition(int position);

    /** persist cache storage content to {@link Parcelable}*/
    Parcelable persist();
}
