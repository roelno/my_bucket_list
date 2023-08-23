package com.zelda.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketAdapter extends RecyclerView.Adapter<BucketAdapter.ViewHolder> {
    private Bucket[] buckets;

    /**
     * Constructor: Initialize the dataset of the Adapter
     *
     * @param buckets Bucket[] containing the data to populate views to be used
     *                by RecyclerView
     */
    public BucketAdapter(Bucket[] buckets) {
        this.buckets = buckets;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bucket, parent, false);
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getBucketTitle().setText(buckets[position].getTitle());
        holder.getBucketDescription().setText(buckets[position].getDescription());
        holder.getBucketImage().setImageResource(buckets[position].getImage());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return buckets.length;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView bucketTitle;
        private final TextView bucketDescription;
        private final ImageView bucketImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bucketTitle = itemView.findViewById(R.id.text_view_bucket_title);
            bucketDescription = itemView.findViewById(R.id.text_view_bucket_description);
            bucketImage = itemView.findViewById(R.id.image_view_bucket_icon);
        }

        public TextView getBucketTitle() {
            return bucketTitle;
        }

        public TextView getBucketDescription() {
            return bucketDescription;
        }

        public ImageView getBucketImage() {
            return bucketImage;
        }
    }

}
