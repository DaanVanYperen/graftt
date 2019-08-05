package net.onedaybeard.graftt;


public interface FusedField {

    class Foo {
        public String hmm;
    }

    @Graft.Recipient(Foo.class)
    class FooTransplant {

        // note: fusing fields only ever makes sense when
        // annotations need to be updated; `hmm` below
        // has no effect on Foo.
        @Graft.Fuse
        public String hmm;
    }

    @Graft.Recipient(Foo.class)
    class FooWrongTransplant {
        @Graft.Fuse
        public String ohNo;
    }
}