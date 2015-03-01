package com.melnikacg.instagramviewer.Presenter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.melnikacg.instagramviewer.Model.CommentItem;
import com.melnikacg.instagramviewer.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CommentsItemAdapter extends ArrayAdapter<CommentItem> {

    public CommentsItemAdapter(Context context, List<CommentItem> comments) {
        super(context, android.R.layout.simple_list_item_1, comments);
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        CommentItem comment = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_comment, parent, false);
        }

        ImageView imgProfile = (ImageView) convertView.findViewById(R.id.imgCommentProfile);
        TextView tvComment = (TextView) convertView.findViewById(R.id.tvComment);
        TextView tvCommentTime = (TextView) convertView.findViewById(R.id.tvCommentTime);

        tvComment.setText(Html.fromHtml("<font color='#3f729b'><b>"
                + comment.getUsername() + "</b></font> "
                + comment.getText()));
        tvCommentTime.setText(comment.getRelativeTime());

        // Reset the images from the recycled view
        imgProfile.setImageResource(0);
        Picasso.with(getContext()).load(comment.getProfileUrl()).into(imgProfile);

        return convertView;
    }

    @Override
    public boolean isEnabled(int position) {
        // disables selection
        return false;
    }
}
