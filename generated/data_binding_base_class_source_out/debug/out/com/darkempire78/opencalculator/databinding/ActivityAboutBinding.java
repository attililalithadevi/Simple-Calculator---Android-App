// Generated by view binder compiler. Do not edit!
package com.darkempire78.opencalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.darkempire78.opencalculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView aboutAboutMadeInFrance;

  @NonNull
  public final TextView aboutAppVersion;

  @NonNull
  public final ImageView aboutBackButton;

  @NonNull
  public final View aboutBackButtonHitbox;

  @NonNull
  public final TextView aboutBackButtonText;

  @NonNull
  public final TextView aboutCategoryInfo;

  @NonNull
  public final TextView aboutDiscord;

  @NonNull
  public final TextView aboutDonate;

  @NonNull
  public final TextView aboutGithub;

  @NonNull
  public final TextView aboutHelp;

  @NonNull
  public final TextView aboutLicense;

  @NonNull
  public final TextView aboutPrivacyPolicy;

  @NonNull
  public final TextView aboutRate;

  @NonNull
  public final TextView aboutSocial;

  @NonNull
  public final TextView aboutTranslate;

  @NonNull
  public final View categoryEndSeparator;

  @NonNull
  public final View categoryHelpUsSeparator;

  @NonNull
  public final View categorySocialSeparator;

  private ActivityAboutBinding(@NonNull NestedScrollView rootView,
      @NonNull TextView aboutAboutMadeInFrance, @NonNull TextView aboutAppVersion,
      @NonNull ImageView aboutBackButton, @NonNull View aboutBackButtonHitbox,
      @NonNull TextView aboutBackButtonText, @NonNull TextView aboutCategoryInfo,
      @NonNull TextView aboutDiscord, @NonNull TextView aboutDonate, @NonNull TextView aboutGithub,
      @NonNull TextView aboutHelp, @NonNull TextView aboutLicense,
      @NonNull TextView aboutPrivacyPolicy, @NonNull TextView aboutRate,
      @NonNull TextView aboutSocial, @NonNull TextView aboutTranslate,
      @NonNull View categoryEndSeparator, @NonNull View categoryHelpUsSeparator,
      @NonNull View categorySocialSeparator) {
    this.rootView = rootView;
    this.aboutAboutMadeInFrance = aboutAboutMadeInFrance;
    this.aboutAppVersion = aboutAppVersion;
    this.aboutBackButton = aboutBackButton;
    this.aboutBackButtonHitbox = aboutBackButtonHitbox;
    this.aboutBackButtonText = aboutBackButtonText;
    this.aboutCategoryInfo = aboutCategoryInfo;
    this.aboutDiscord = aboutDiscord;
    this.aboutDonate = aboutDonate;
    this.aboutGithub = aboutGithub;
    this.aboutHelp = aboutHelp;
    this.aboutLicense = aboutLicense;
    this.aboutPrivacyPolicy = aboutPrivacyPolicy;
    this.aboutRate = aboutRate;
    this.aboutSocial = aboutSocial;
    this.aboutTranslate = aboutTranslate;
    this.categoryEndSeparator = categoryEndSeparator;
    this.categoryHelpUsSeparator = categoryHelpUsSeparator;
    this.categorySocialSeparator = categorySocialSeparator;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_about_made_in_france;
      TextView aboutAboutMadeInFrance = ViewBindings.findChildViewById(rootView, id);
      if (aboutAboutMadeInFrance == null) {
        break missingId;
      }

      id = R.id.about_app_version;
      TextView aboutAppVersion = ViewBindings.findChildViewById(rootView, id);
      if (aboutAppVersion == null) {
        break missingId;
      }

      id = R.id.about_back_button;
      ImageView aboutBackButton = ViewBindings.findChildViewById(rootView, id);
      if (aboutBackButton == null) {
        break missingId;
      }

      id = R.id.about_back_button_hitbox;
      View aboutBackButtonHitbox = ViewBindings.findChildViewById(rootView, id);
      if (aboutBackButtonHitbox == null) {
        break missingId;
      }

      id = R.id.about_back_button_text;
      TextView aboutBackButtonText = ViewBindings.findChildViewById(rootView, id);
      if (aboutBackButtonText == null) {
        break missingId;
      }

      id = R.id.about_category_info;
      TextView aboutCategoryInfo = ViewBindings.findChildViewById(rootView, id);
      if (aboutCategoryInfo == null) {
        break missingId;
      }

      id = R.id.about_discord;
      TextView aboutDiscord = ViewBindings.findChildViewById(rootView, id);
      if (aboutDiscord == null) {
        break missingId;
      }

      id = R.id.about_donate;
      TextView aboutDonate = ViewBindings.findChildViewById(rootView, id);
      if (aboutDonate == null) {
        break missingId;
      }

      id = R.id.about_github;
      TextView aboutGithub = ViewBindings.findChildViewById(rootView, id);
      if (aboutGithub == null) {
        break missingId;
      }

      id = R.id.about_help;
      TextView aboutHelp = ViewBindings.findChildViewById(rootView, id);
      if (aboutHelp == null) {
        break missingId;
      }

      id = R.id.about_license;
      TextView aboutLicense = ViewBindings.findChildViewById(rootView, id);
      if (aboutLicense == null) {
        break missingId;
      }

      id = R.id.about_privacy_policy;
      TextView aboutPrivacyPolicy = ViewBindings.findChildViewById(rootView, id);
      if (aboutPrivacyPolicy == null) {
        break missingId;
      }

      id = R.id.about_rate;
      TextView aboutRate = ViewBindings.findChildViewById(rootView, id);
      if (aboutRate == null) {
        break missingId;
      }

      id = R.id.about_social;
      TextView aboutSocial = ViewBindings.findChildViewById(rootView, id);
      if (aboutSocial == null) {
        break missingId;
      }

      id = R.id.about_translate;
      TextView aboutTranslate = ViewBindings.findChildViewById(rootView, id);
      if (aboutTranslate == null) {
        break missingId;
      }

      id = R.id.category_end_separator;
      View categoryEndSeparator = ViewBindings.findChildViewById(rootView, id);
      if (categoryEndSeparator == null) {
        break missingId;
      }

      id = R.id.category_help_us_separator;
      View categoryHelpUsSeparator = ViewBindings.findChildViewById(rootView, id);
      if (categoryHelpUsSeparator == null) {
        break missingId;
      }

      id = R.id.category_social_separator;
      View categorySocialSeparator = ViewBindings.findChildViewById(rootView, id);
      if (categorySocialSeparator == null) {
        break missingId;
      }

      return new ActivityAboutBinding((NestedScrollView) rootView, aboutAboutMadeInFrance,
          aboutAppVersion, aboutBackButton, aboutBackButtonHitbox, aboutBackButtonText,
          aboutCategoryInfo, aboutDiscord, aboutDonate, aboutGithub, aboutHelp, aboutLicense,
          aboutPrivacyPolicy, aboutRate, aboutSocial, aboutTranslate, categoryEndSeparator,
          categoryHelpUsSeparator, categorySocialSeparator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
