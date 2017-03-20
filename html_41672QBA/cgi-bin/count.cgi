#!/usr/bin/perl -w

@invdigits = ("ff c3 99 99 99 99 99 99 99 99 c3 ff", #0
              "ff cf c7 cf cf cf cf cf cf cf c7 ff", #1
              "ff c3 99 9f 9f cf e7 f3 f9 f9 81 ff", #2
              "ff c3 99 9f 9f c7 9f 9f 9f 99 c3 ff", #3
              "ff cf cf c7 c7 cb cb cd 81 cf 87 ff", #4
              "ff 81 f9 f9 f9 c1 9f 9f 9f 99 c3 ff", #5
              "ff c7 f3 f9 f9 c1 99 99 99 99 c3 ff", #6
              "ff 81 99 9f 9f cf cf e7 e7 f3 f3 ff", #7
              "ff c3 99 99 99 c3 99 99 99 99 c3 ff", #8
              "ff c3 99 99 99 99 83 9f 9f cf e3 ff");

$filejv = "counters/count.dat";    # relative to cgi-bin
$count = sprintf ("%06d",
                inccounter($filejv));

$countlen = length($count);

$width = $countlen * 8;
$height = 12;

@bytes = ();

for ($line=0; $line < $height; $line++) {
   for ($digit=0; $digit < $countlen; $digit++) {
      $field = substr($count, $digit, 1);
      $byte = substr($invdigits[$field], $line*3, 2);
      push(@bytes, $byte);
   }
}

print <<"EOT";
Content-type: image/x-xbitmap

#define count_width $width
#define count_height $height

static char count_bits[] = {
EOT

for($i=0; $i<=$#bytes; $i++) {
   print "0x$bytes[$i]";
   print "," if $i != $#bytes;
   print "\n" unless ($i+1) % 7;
}

print "};\n";

sub inccounter {
   my $file = shift;
   my $count = 0;

   if(open(FILE,"<$file")) {
      $count = <FILE>;
      close(FILE);
   }

   $count++;

   open(FILE,">$file") || die "Cannot open $file";
   print FILE "$count";
   close(FILE);

   $count;
}

