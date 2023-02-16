function nut () {
    return cylinder({r:4, h:2, fn:6, center:true});
}

function bolt (length) {
    return union (
        cylinder({r:2, h:length, fn:200, center:true}),
        cylinder({r:3.5, h:2, fn:200, center:true}).translate([0,0,length/2])
    );
}

function main () {
  return union(
    nut(),
    bolt(30)
  )
}
