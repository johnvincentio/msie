#!/usr/bin/perl
use MIME::Base64;

#printf MIME::Base64::encode("foo:bar");

#printf MIME::Base64::encode("foofbar");

my $abc=MIME::Base64::encode("foo:bar");

printf $abc;

printf MIME::Base64::decode($abc);

printf "\nEnd\n";

